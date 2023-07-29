import React from 'react'
import "./Footer.css"
import logo from "../../assets/homepage.svg"

const Footer = () => {
    return <footer>
        <div className="wrapper">
            <div className={"footer"}>
                <a href="#" className="logo">
                    <svg class="icon">
                        <use href={logo + "#logo"}></use>
                    </svg>
                </a>

                <ul>
                    <li><a href="#">Статті</a></li>
                    <li><a href="#">Тести</a></li>
                    <li><a href="#">Карта</a></li>
                </ul>
            </div>
        </div>
    </footer>
}

export default Footer;