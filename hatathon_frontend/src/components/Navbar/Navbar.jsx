import React from 'react'
import "./Navbar.css"
import logo from "./../../assets/homepage.svg"
import account_icon from "./account_icon.svg"

const Navbar = () => {
    return <nav>
        <a href="#" className="logo">
            <svg className="icon">
                <use href={logo + "#logo"}></use>
            </svg>
        </a>

        <ul>
            <li><a href="#">Статті</a></li>
            <li><a href="#">Тести</a></li>
            <li><a href="#">Карта</a></li>
        </ul>

        <ul>
            <li>
                <a href="#">
                    <img src={account_icon} alt="Account icon"/>
                </a></li>
            <li><a href="#">Укр</a></li>
            <li><a href="#">Eng</a></li>
        </ul>
    </nav>
}

export default Navbar;