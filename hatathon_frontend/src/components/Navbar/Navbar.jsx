import React from 'react'
import "./Navbar.css"
import logo from "./../../assets/homepage.svg"

const Navbar = ({dark}) => {
    const navbarClass = dark ? "navbar-dark" : "navbar-light";

    return <nav className={navbarClass}>
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

        <ul>
            <li>
                <a href="#">
                    <svg className="icon account-icon">
                        <use href={logo + "#account_icon"}></use>
                    </svg>
                </a>
            </li>
            <li><a href="#">Укр</a></li>
            <li><a href="#">Eng</a></li>
        </ul>
    </nav>
}

export default Navbar;