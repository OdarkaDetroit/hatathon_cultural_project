import React from 'react'
import "./Homepage.css"
import {Filters, Footer, Hero, Navbar, Tests} from "../../components";

const Homepage = () => {
    return <div id={"homepage"} className={"flex w-full flex-col items-center"}>
        <div className="wrapper nav-wrapper">
            <Navbar/>
        </div>
        <Hero/>
        <Filters/>
        <Tests/>
        <div className={"w-full footer-wrapper"}>
            <Footer/>
        </div>
    </div>
}

export default Homepage;