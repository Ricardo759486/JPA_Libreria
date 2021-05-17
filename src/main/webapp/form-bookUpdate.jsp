<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JPA Tutorial</title>
    <meta name="format-detection" content="telephone=no">
    <meta name="viewport"
          content="width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta charset="utf-8">
    <link rel="icon" href="images/favicon.png" type="image/x-icon">
    <!-- Stylesheets-->

    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/fonts.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <style>.ie-panel {
        display: none;
        background: #212121;
        padding: 10px 0;
        box-shadow: 3px 3px 5px 0 rgba(0, 0, 0, .3);
        clear: both;
        text-align: center;
        position: relative;
        z-index: 1;
    }

    html.ie-10 .ie-panel, html.lt-ie-10 .ie-panel {
        display: block;
    }</style>
</head>
<body>
<div class="page"><a class="banner banner-top"
                     href="https://www.templatemonster.com/intense-multipurpose-html-template.html" target="_blank"></a>
    <header class="page-header">
        <!-- RD Navbar-->
        <div class="rd-navbar-wrap">
            <nav class="rd-navbar rd-navbar_transparent rd-navbar_boxed" data-layout="rd-navbar-fixed"
                 data-sm-layout="rd-navbar-fixed" data-sm-device-layout="rd-navbar-fixed"
                 data-md-layout="rd-navbar-fixed" data-md-device-layout="rd-navbar-fixed"
                 data-lg-device-layout="rd-navbar-fixed" data-lg-layout="rd-navbar-static"
                 data-xl-device-layout="rd-navbar-static" data-xl-layout="rd-navbar-static"
                 data-xxl-device-layout="rd-navbar-static" data-xxl-layout="rd-navbar-static"
                 data-stick-up-clone="false" data-sm-stick-up="true" data-md-stick-up="true" data-lg-stick-up="true"
                 data-md-stick-up-offset="115px" data-lg-stick-up-offset="35px" data-body-class="rd-navbar-absolute">
                <!-- RD Navbar Top Panel-->
                <div class="rd-navbar-top-panel">
                    <div class="rd-navbar-top-panel__main">
                        <div class="rd-navbar-top-panel__toggle rd-navbar-fixed__element-1 rd-navbar-static--hidden"
                             data-rd-navbar-toggle=".rd-navbar-top-panel__main"><span></span></div>
                        <div class="rd-navbar-top-panel__content">
                            <div class="rd-navbar-top-panel__right">
                                <ul class="list-inline-xxs">
                                    <li><a class="icon icon-xxs icon-gray-darker fa fa-twitter" href="#"></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="rd-navbar-inner rd-navbar-search-wrap">
                    <!-- RD Navbar Panel-->
                    <div class="rd-navbar-panel rd-navbar-search-lg_collapsable">
                        <button class="rd-navbar-toggle" data-rd-navbar-toggle=".rd-navbar-nav-wrap"><span></span>
                        </button>
                        <!-- RD Navbar Brand-->
                        <div class="rd-navbar-brand"><a class="brand-name" href="index.jsp"><img
                                src="images/linkedin_banner_image_1.png" alt="" width="172" height="33"/></a></div>
                    </div>
                    <!-- RD Navbar Nav-->
                    <div class="rd-navbar-nav-wrap rd-navbar-search_not-collapsable">
                        <div class="rd-navbar-search_collapsable">
                            <ul class="rd-navbar-nav">
                                <li class="active"><a href="index.html">Home</a>
                                </li>
                                <li><a href="form-author.jsp">Author</a>
                                </li>
                                <li><a href="form-book.jsp">Book</a>
                                </li>
                                <li><a href="form-library.jsp">Library</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>
            <div class="section-lg">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-5">
                            <form action="./update-book">
                                <input type="hidden" id="bookId" name="bookId"
                                       value="<%= request.getParameter("bookId") %>">
                                Title: <input type="text" id="title" name="title">
                                <br/>
                                ISBN Number: <input type="text" id="isbn" name="isbn">
                                <br/>
                                Book's genre: <input type="text" id="genere" name="genere">
                                <br/>
                                <br/>
                                <input type="submit" value="Update book!">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
</div>
<script src="js/core.min.js"></script>
<script src="js/script.js"></script>
</body>
</html>