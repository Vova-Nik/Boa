package com.vovan.vova;

public class VContainer {

    private static String header_tologin; //
    private static String header_user; //
    private static String footer; //

    public static String getHeader(String user_name) {
        if(user_name.length()<2)
            return header_tologin;
        if(user_name == null)
            return header_tologin;
        else {
            header_user = "<nav class=\"navbar navbar-inverse\">" +
                    "  <div class=\"container-fluid\">" +
                    "    <div class=\"navbar-header\">" +
                    "      <span class=\"navbar-brand\">Boa</span>" +
                    "    </div>" +
                    "    <ul class=\"nav navbar-nav\">" +
                    "      <li class=\"active\"><a href=\"/index\">Home</a></li>" +
                    "      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Manage DB <span class=\"caret\"></span></a>" +
                    "        <ul class=\"dropdown-menu\">" +
                    "          <li><a href=\"/VDelDB\">Delete user from DB</a></li>" +
                    "          <li><a href=\"/VShowDB\">Show DB</a></li>" +
                    "        </ul>" +
                    "      </li>" +
                    "      <li><a href=\"#\">Page 2</a></li>" +
                    "    </ul>" +
                    "    <ul class=\"nav navbar-nav navbar-right\">" +
                    "      <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>" +
                     user_name +  "</a>" +
                    " </li>" +

                    " </ul>" +
                    " </div>" +
                    "</nav>";
            return header_user;
        }

    }


    public VContainer() {
        header_tologin = "<nav class=\"navbar navbar-inverse\">\n" +
                "  <div class=\"container-fluid\">" +
                "    <div class=\"navbar-header\">" +
                "      <span class=\"navbar-brand\">Boa</span>" +
                "    </div>" +
                "    <ul class=\"nav navbar-nav\">" +
                "      <li class=\"active\"><a href=\"/index\">Home</a></li>" +
                "      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Manage DB<span class=\"caret\"></span></a>" +
                "        <ul class=\"dropdown-menu\">" +
                "          <li><a href=\"/VDelDB\">Delete user from DB</a></li>" +
                "          <li><a href=\"/VShowDB\">Show DB</a></li>" +
                "        </ul>" +
                "      </li>" +
                "      <li><a href=\"#\">Page 2</a></li>" +
                "    </ul>" +
                "    <ul class=\"nav navbar-nav navbar-right\">" +
                "      <li><a href=\"/registration\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>" +
                "      <li><a href=\"/login\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>" +
                "    </ul>" +
                "  </div>" +
                "</nav>";


        footer = "<nav class=\"navbar navbar-inverse\">" +
                "    <div class=\"container-fluid\">" +
                "        <div class=\"navbar-header\">" +
                "            <a class=\"navbar-brand\" href=\"/index\">Boa</a>" +
                "        </div>\n" +
                "            <li><a href=\"/registration\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>" +
                "            <li><a href=\"/login\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>" +
                "        </ul>" +
                "    </div>" +
                "</nav>";
    }


    public static String getFooter() {
        return footer;
    }


}

