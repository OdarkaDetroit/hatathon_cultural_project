import React from 'react'
import "./Footer.css"
import logo from "../../assets/homepage.svg"

const Footer = ({dark}) => {
    const footerClass = dark ? "footer-dark" : "footer-light";

    return <footer>
        <div className="wrapper">
            <div className={"footer " + footerClass}>
                <a href="#" className="logo">
                    <svg className="icon">
                        <use href={logo + "#logo"}></use>
                    </svg>
                </a>

                <ul>
                    <li><a href="/#articles">Статті</a></li>
                    <li><a href="/#tests">Тести</a></li>
                    <li><a href="/#map-section">Карта</a></li>
                </ul>
            </div>
        </div>
    </footer>
}

export default Footer;