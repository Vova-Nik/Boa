package com.vovan.vova;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class Controller1 {
    @Autowired private VService vservice;
    @Autowired private CustomerRepository repository;

/*    @RequestMapping(value = "/vova")
    public String contRetVova(Model model){
        model.addAttribute("vvvv", "Controller is running");
        model.addAttribute("vcastomer", new Customer());
        return "vova"; //page which should be shown .../vova.html
    }*/

     @RequestMapping(value = "VShowDB")
    public String showVova(HttpServletRequest req, Model model) {
        VContainer vconteiner = new VContainer();
        HttpSession http_session = req.getSession();
        String current_user;
        if(http_session.getAttribute("user_mail")==null)
            current_user = "0";
        else
            current_user = (String)http_session.getAttribute("user_mail");
        String cont = VContainer.getHeader(current_user);
        model.addAttribute("menu_bar", cont);
        List<Customer> list = (List<Customer>) repository.findAll();
        model.addAttribute("customerList", list);
        return "VShowDB";
    }

    @RequestMapping(value = "VDelDB")
    public String VDelDB(HttpServletRequest req, Model model) {
        VContainer vconteiner = new VContainer();
        HttpSession http_session = req.getSession();
        String current_user;
        if(http_session.getAttribute("user_mail")==null)
            current_user = "0";
        else
            current_user = (String)http_session.getAttribute("user_mail");

        String cont = VContainer.getHeader(current_user);
        model.addAttribute("menu_bar", cont);

        List<Customer> list = (List<Customer>) repository.findAll();
        model.addAttribute("customerList", list);
        return "VDelDB";
    }

    @RequestMapping(value = "delDBButton")
    public String deleteFromDB(HttpServletRequest vreq, Model model) {
        Map<String, String[]> map = vreq.getParameterMap();
        List<String> mapIdList = new ArrayList<>(map.keySet());
        for (String s:mapIdList) {
            repository.delete(Long.parseLong(s));
        }
        return "redirect:/VShowDB";
    }

/*    @RequestMapping(value = "changeDBButton/{param}")
    public String changeDB(@PathVariable String param, HttpServletRequest vreq, Model model) {
        Map<String, String[]> map = vreq.getParameterMap();
        //List<String> mapIdList = new ArrayList<>(map.keySet());
        //String s = mapIdList;
        //repository.delete(Long.parseLong(s));
        return "redirect:/VShowDB";
    }*/

/*    @RequestMapping(value = "VDeleteForm")
    public String deleteVova(@ModelAttribute Customer customer, HttpServletRequest vreq){
        //model.addAttribute("vvvv", "Hi from contoller");
        List<Customer> c = repository.findByTitle(customer.getTitle());
        for(Customer curent_cust : c) {
            repository.delete(curent_cust.getId());
        }

        Map<String, String[]> map = vreq.getParameterMap();
        //System.out.println("Controller: Form delete");
        return "vova"; //page which should be shown .../vova.html
    }*/

    @RequestMapping("/index")
    public String home(Map<String, Object> model, HttpServletRequest req) {
        VContainer vconteiner = new VContainer();
        HttpSession http_session = req.getSession();
        String current_user;
        if(http_session.getAttribute("user_mail")==null)
        current_user = "0";
        else {
            current_user = (String) http_session.getAttribute("user_mail");
            String[] s = current_user.split("@");
            String ss=s[0].substring(0,1).toUpperCase() + s[0].substring(1);
            model.put("message",ss);
        }
        String cont = VContainer.getHeader(current_user);

        model.put("menu_bar", cont);

        model.put("message1", "What is JSP page");

        cont = VContainer.getFooter();
        model.put("footer", cont);
        return "index";
    }

/*    @RequestMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        return "next";
    }*/

    @RequestMapping("/registration")
    public String registration(Map<String, Object> model) {
        model.put("message", "You are welcom !!");
        return "registration";
    }

    @RequestMapping(value = "VCreateForm")    //set in html form https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit
    public String createVova(@ModelAttribute Customer customer, HttpServletRequest vreq, Model model){
        Map<String, String[]> map = vreq.getParameterMap();
        String ttt = customer.getTitle();
        String sn = customer.getSurename();
        String mmm = customer.getMail();
        String pw = customer.getPassword();
        String ppp = String.valueOf(customer.getPrice());

        //String tit = vreq.getParameter("title");

        List<Customer> list = repository.findByMail(mmm);
        if(list.isEmpty()) {
            //  if(ttt.isEmpty()){ttt=mmm; pw="1";}
            repository.save(new Customer(ttt, ppp, sn, mmm, pw));
        }
        else{model.addAttribute("custexists", "Such customer alredy exists");}
        return "redirect:/login"; //page which should be shown .../next.jsp
    }


    @RequestMapping("/login")
    public String login(Map<String, Object> model, HttpServletRequest req ) {
        VContainer vconteiner = new VContainer();
        /*HttpSession http_session = req.getSession();
        String current_user;
        if(http_session.getAttribute("user_mail")==null)
            current_user = "0";
        else
            current_user = (String)http_session.getAttribute("user_mail");*/

        String cont = VContainer.getHeader("0");

        model.put("menu_bar", cont);
        model.put("message", "You are welcom !!");
        return "login";
    }


    @RequestMapping(value = "VLoginForm")    //set in html form https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit
    public String VLoginForm(@ModelAttribute Customer customer, HttpServletRequest vreq, Model model){
        Map<String, String[]> map = vreq.getParameterMap();
        String mmm = customer.getMail();
        String pw = customer.getPassword();
        List<Customer> list = repository.findByMail(mmm);
        if(list.isEmpty()) {
            model.addAttribute("LoginError", "No such e-mail in list");
            return "login";
        }

        Customer loginingCustomer = list.get(0);
        Long cid = loginingCustomer.getId();
        if(!pw.equals(loginingCustomer.getPassword())){
            model.addAttribute("LoginError", "<script> alert(\"Wrong password!\");</script>");
            return "login";
    }
        int pr = loginingCustomer.getPrice();
        loginingCustomer.setPrice(pr+1);
        //repository.save(loginingCustomer);

        HttpSession httpsession = vreq.getSession();
        httpsession.setAttribute("user_mail",mmm);

            repository.delete(cid);
            repository.save(loginingCustomer);


        return "redirect:/index";//page which should be shown .../next.jsp
    }

}
