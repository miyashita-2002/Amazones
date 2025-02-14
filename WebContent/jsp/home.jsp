<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Amazones</title>

        <!--CSS-->
        <link rel="stylesheet" href="https://unpkg.com/ress/dist/ress.min.css">


    </head>

    <body>
        <header class="sub_colum page-header">



            <!--ナビゲーションメニュー-->
            <div class="topnav">
                <!--logo-->
                <h1>
                    <a href="#.jsp"><img class="logo" src="#.png" alt="AMAZONES"></a>
                </h1>
                <a href="#about">家電</a>
                <a href="#contact">スケボー</a>
                <a href="#contact">パソコン・オフィス</a>
                <a href="#contact">化粧品</a>
                <i class="far fa-user"></i>
                <div class="search-container">
                    <form action="/#">
                        <input type="text" placeholder="キーワードで検索" name="search">
                        <button type="submit"><i class="fas fa-search" style="font-size:24px;"></i></button>
                    </form>
                </div>
            </div>

            <style>
                * {
                    box-sizing: border-box;
                }

                body {
                    margin: 0;
                    font-family: Arial, Helvetica, sans-serif;
                }

                .topnav {
                    overflow: hidden;
                    background-color: whitesmoke;
                }

                .topnav a {
                    float: left;
                    display: block;
                    color: black;
                    text-align: center;
                    padding: 14px 16px;
                    text-decoration: none;
                    font-size: 17px;
                }

                .topnav i {
                    color: black
                }

                .topnav a:hover {
                    background-color: lightblue;
                    color: black;
                }

                .topnav a.active {
                    background-color: #2196F3;
                    color: white;
                }

                .topnav .search-container {
                    float: right;
                }

                .topnav input[type=text] {
                    padding: 6px;
                    margin-top: 8px;
                    font-size: 17px;
                    border: none;
                }

                .topnav .search-container button {
                    float: right;
                    padding: 6px 10px;
                    margin-top: 8px;
                    margin-right: 16px;
                    background: #ddd;
                    font-size: 17px;
                    border: none;
                    cursor: pointer;
                }

                .topnav .search-container button:hover {
                    background: #ccc;
                }

                @media screen and (max-width: 600px) {
                    .topnav .search-container {
                        float: none;
                    }

                    .topnav a,
                    .topnav input[type=text],
                    .topnav .search-container button {
                        float: none;
                        display: block;
                        text-align: left;
                        width: 100%;
                        margin: 0;
                        padding: 14px;
                    }

                    .topnav input[type=text] {
                        border: 1px solid #ccc;
                    }
                }
            </style>
        </header>
    </body>

    </html>