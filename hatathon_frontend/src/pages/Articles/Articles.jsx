import React from 'react'
import "./Articles.css"
import {Filters, Footer, Hero, Navbar, Tests} from "../../components";

const Articles = () => {
    return <div id={"articles"} className={"flex w-full flex-col items-center"}>
        <div className="w-full">
            <div className="wrapper">
                <Navbar/>
            </div>
        </div>

        <div className={"w-full footer-wrapper"}>
            <Footer/>
        </div>
    </div>
}

export default Articles;