import React from 'react'
import "./Navbar.css"
import logo from "./logo.svg"
import account_icon from "./account_icon.svg"

const Navbar = () => {
    return <nav>
        <a href="#" className="logo">
            <img src={logo} alt="Logo"/>
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