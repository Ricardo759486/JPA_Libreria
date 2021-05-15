<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>

        <meta charset="UTF-8">
        <title>Home</title>
        <meta name="format-detection" content="telephone=no">
        <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta charset="utf-8">
        <link rel="icon" href="images/favicon.ico" type="image/x-icon">
        <!-- Stylesheets-->

        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/fonts.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <style>.ie-panel{display: none;background: #212121;padding: 10px 0;box-shadow: 3px 3px 5px 0 rgba(0,0,0,.3);clear: both;text-align:center;position: relative;z-index: 1;} html.ie-10 .ie-panel, html.lt-ie-10 .ie-panel {display: block;}</style>

        <style>
            table, th, td {
                border: 1px solid black;
            }
        </style>

    </head>
    <body>
    <div class="preloader">
        <div class="cssload-container">
            <svg class="filter" version="1.1">
                <defs>
                    <filter id="gooeyness">
                        <fegaussianblur in="SourceGraphic" stddeviation="10" result="blur"></fegaussianblur>
                        <fecolormatrix in="blur" values="1 0 0 0 0  0 1 0 0 0  0 0 1 0 0  0 0 0 20 -10" result="gooeyness"></fecolormatrix>
                        <fecomposite in="SourceGraphic" in2="gooeyness" operator="atop"></fecomposite>
                    </filter>
                </defs>
            </svg>
            <div class="dots">
                <div class="dot mainDot"></div>
                <div class="dot"></div>
                <div class="dot"></div>
                <div class="dot"></div>
                <div class="dot"></div>
            </div>
            <p>Loading...</p>
        </div>
    </div>
    <!-- Page-->
    <div class="page"><a class="banner banner-top" href="https://www.templatemonster.com/intense-multipurpose-html-template.html" target="_blank"><img src="src/main/webapp/images/intense_02.jpg" alt="" height="0"/></a>
        <header class="page-header">
            <!-- RD Navbar-->
            <div class="rd-navbar-wrap">
                <nav class="rd-navbar rd-navbar_transparent rd-navbar_boxed" data-layout="rd-navbar-fixed" data-sm-layout="rd-navbar-fixed" data-sm-device-layout="rd-navbar-fixed" data-md-layout="rd-navbar-fixed" data-md-device-layout="rd-navbar-fixed" data-lg-device-layout="rd-navbar-fixed" data-lg-layout="rd-navbar-static" data-xl-device-layout="rd-navbar-static" data-xl-layout="rd-navbar-static" data-xxl-device-layout="rd-navbar-static" data-xxl-layout="rd-navbar-static" data-stick-up-clone="false" data-sm-stick-up="true" data-md-stick-up="true" data-lg-stick-up="true" data-md-stick-up-offset="115px" data-lg-stick-up-offset="35px" data-body-class="rd-navbar-absolute">
                    <!-- RD Navbar Top Panel-->
                    <div class="rd-navbar-top-panel">
                        <div class="rd-navbar-top-panel__main">
                            <div class="rd-navbar-top-panel__toggle rd-navbar-fixed__element-1 rd-navbar-static--hidden" data-rd-navbar-toggle=".rd-navbar-top-panel__main"><span></span></div>
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
                            <button class="rd-navbar-toggle" data-rd-navbar-toggle=".rd-navbar-nav-wrap"><span></span></button>
                            <!-- RD Navbar Brand-->
                            <div class="rd-navbar-brand"><a class="brand-name" href="index.html"><img src="images/logo-344x67.png" alt="" width="172" height="33"/></a></div>
                        </div>
                        <!-- RD Navbar Nav-->
                        <div class="rd-navbar-nav-wrap rd-navbar-search_not-collapsable">
                            <div class="rd-navbar-search_collapsable">
                                <ul class="rd-navbar-nav">
                                    <li class="active"><a href="index.html">Home</a>
                                    </li>
                                    <li><a href="about.html">About</a>
                                    </li>
                                    <li><a href="typography.html">Typography</a>
                                    </li>
                                    <li><a href="contacts.html">Contacts</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </nav>
            </div>
        </header>
        <!-- Swiper-->
        <svg class="defs">
            <defs>
                <lineargradient id="gradient1" x1="0%" y1="0%" x2="100%" y2="100%">
                    <stop offset="50%" stop-color="#AA54ED">
                        <animate attributename="stop-color" values="#AA54ED; #5348E2; #AA54ED" dur="5s" repeatcount="indefinite"></animate>
                    </stop>
                    <stop offset="100%" stop-color="#5348E2">
                        <animate attributename="stop-color" values="#5348E2; #AA54ED; #5348E2" dur="5s" repeatcount="indefinite"></animate>
                    </stop>
                </lineargradient>
            </defs>
        </svg>
        <div class="swiper-container swiper-slider" data-effect="frame-trapeze" data-loop="true" data-autoplay="5500" data-speed="1200" data-mousewheel="false" data-keyboard="true" data-frame-fill="url(#gradient1)">
            <div class="swiper-wrapper">
                <div class="swiper-slide">
                    <div class="swiper-slide-img" style="background-image: url(images/slider-slide-5-1920x1280.jpg);" data-swiper-anime="{ &quot;animation&quot;: &quot;swiperSlideRotate&quot;, &quot;duration&quot;: 2000, &quot;delay&quot;: 600 }"></div>
                    <div class="swiper-slide-caption text-center context-dark">
                        <h1 data-swiper-anime="{ &quot;animation&quot;: &quot;swiperContentStack&quot;, &quot;duration&quot;: 1000, &quot;delay&quot;: 500 }">Element</h1>
                        <h3 data-swiper-anime="{ &quot;animation&quot;: &quot;swiperContentStack&quot;, &quot;duration&quot;: 1000, &quot;delay&quot;: 600 }">New HTML Templates Generation</h3>
                        <div class="group-lg group-middle" data-swiper-anime="{ &quot;animation&quot;: &quot;swiperContentStack&quot;, &quot;duration&quot;: 1000, &quot;delay&quot;: 700 }"><a class="button button-primary button-shadow" href="#features" data-custom-scroll-to="features">See Features</a><a class="button button-black button-shadow" href="#">Buy template</a></div>
                    </div>
                </div>
                <div class="swiper-slide">
                    <div class="swiper-slide-img" style="background-image: url(images/slider-slide-6-1920x986.jpg);" data-swiper-anime="{ &quot;animation&quot;: &quot;swiperSlideRotate&quot;, &quot;duration&quot;: 2000, &quot;delay&quot;: 600 }"></div>
                    <div class="swiper-slide-caption context-dark">
                        <h2 data-swiper-anime="{ &quot;animation&quot;: &quot;swiperContentStack&quot;, &quot;duration&quot;: 1000, &quot;delay&quot;: 500 }">The Power of Bootstrap<br class="d-none d-lg-block"> Discover it with Element</h2><a class="button button-primary button-shadow" href="#" data-swiper-anime="{ &quot;animation&quot;: &quot;swiperContentStack&quot;, &quot;duration&quot;: 1000, &quot;delay&quot;: 700 }">Buy template</a>
                    </div>
                </div>
                <div class="swiper-slide">
                    <div class="swiper-slide-img" style="background-image: url(images/slider-slide-7-1920x1080.jpg);" data-swiper-anime="{ &quot;animation&quot;: &quot;swiperSlideRotate&quot;, &quot;duration&quot;: 2000, &quot;delay&quot;: 600 }"></div>
                    <div class="swiper-slide-caption context-dark">
                        <div class="container">
                            <div class="row justify-content-center">
                                <div class="col-lg-7">
                                    <h2 data-swiper-anime="{ &quot;animation&quot;: &quot;swiperContentStack&quot;, &quot;duration&quot;: 1000, &quot;delay&quot;: 500 }">Built by geeks & used by humans</h2>
                                    <h5 class="text-width-2 block-centered" data-swiper-anime="{ &quot;animation&quot;: &quot;swiperContentStack&quot;, &quot;duration&quot;: 1000, &quot;delay&quot;: 600 }">Element aims to satisfy real needs of real projects. We've got a pack of tools for that.</h5>
                                    <div class="group-lg group-middle" data-swiper-anime="{ &quot;animation&quot;: &quot;swiperContentStack&quot;, &quot;duration&quot;: 1000, &quot;delay&quot;: 700 }"><a class="button button-black button-shadow" href="#features" data-custom-scroll-to="features">See Features</a><a class="button button-primary button-shadow" href="#">Buy template</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="swiper-pagination"></div>
            <div class="swiper-button-prev linear-icon-chevron-left"></div>
            <div class="swiper-button-next linear-icon-chevron-right"></div>
        </div>


        <!-- About us-->
        <section class="bg-gray-lighter object-wrap">
            <div class="bg-decor d-flex align-items-center justify-content-start" data-parallax-scroll="{&quot;y&quot;: 60,  &quot;smoothness&quot;: 30}"><img src="images/bg-decor-4.png" alt=""/>
            </div>
            <div class="section-lg">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-5">

                            <h2>Library Manager</h2>
                            <button onclick="location.href='./form-library.jsp';">Create library</button>
                            <button onclick="location.href='./form-author.jsp';">Create author</button>
                            <div/>
                            <h3>Libraries</h3>

                            <table id="librariesTbl">
                                <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Name</th>
                                </tr>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>

                            <h3>Authors</h3>

                            <table id="authorsTbl">
                                <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Name</th>
                                    <th># Books</th>
                                    <th>Actions</th>
                                </tr>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <div class="object-wrap__body object-wrap__body-sizing-1 object-wrap__body-md-right bg-image" style="background-image: url(images/bg-image-1.jpg)"></div>
        </section>
    <!-- Javascript-->
    <script src="js/core.min.js"></script>
    <script src="js/script.js"></script>
        <script>

            function printTable(elementId, servlet, columns, actions = []) {

                var xhr = new XMLHttpRequest();
                xhr.onreadystatechange = function() {
                    if (xhr.readyState == 4) {
                        var data = JSON.parse(xhr.responseText);

                        var tbodyRef = document.getElementById(elementId).getElementsByTagName('tbody')[0];

                        data.map(d => {

                            var newRow = tbodyRef.insertRow();

                            columns.map(c => {
                                var cell = newRow.insertCell();
                                var text = document.createTextNode(d[c]);
                                cell.appendChild(text);
                            });

                            if (actions.includes('create-book')) {
                                var cell = newRow.insertCell();
                                var action = document.createElement('button');
                                action.setAttribute('onclick', 'location.href="./form-book.jsp?authorId=' + d['authorId'] + '";');
                                var text = document.createTextNode('Create book');
                                action.appendChild(text);
                                cell.appendChild(action);
                            }

                            if (actions.includes('delete-author')) {
                                var cell = newRow.insertCell();
                                var action = document.createElement('button');
                                action.setAttribute('onclick', 'location.href="./delete-author?authorId=' + d['authorId'] + '";');
                                var text = document.createTextNode('Delete author');
                                action.appendChild(text);
                                cell.appendChild(action);
                            }

                        });

                    }
                }
                xhr.open('GET', '${pageContext.request.contextPath}/' + servlet, true);
                xhr.send(null);

            }

            // Printing libraries
            printTable(elementId = 'librariesTbl', servlet = 'list-libraries', columns = ['libraryId', 'name']);

            // Printing authors
            printTable(elementId = 'authorsTbl', servlet = 'list-authors', columns = ['authorId', 'name', 'numBooks'], actions = ['create-book', 'delete-author']);

        </script>

    </body>
</html>