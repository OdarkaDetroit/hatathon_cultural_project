import React from 'react'
import "./Filters.css"
import card1 from "./card1.png"
import card2 from "./card2.png"
import card3 from "./card3.png"
import card4 from "./card4.png"
import FilterCard from "../FilterCard/FilterCard";

const Filters = () => {
    return (
        <div className="filter-section wrapper">
            <h1 className="filters-header">Впіймай ехо історії</h1>
            <div className="filters">
                <div className="filters-elements">

                </div>
                <div className="filters-results-layout">
                    <FilterCard label={"Приготування борщу"} withArrow={true} imgSrc={card1}/>
                    <FilterCard label={"Опішнянська кераміка"} imgSrc={card2}/>
                    <div className={"filters-results-layout filters-results-layout-vertical"}>
                        <div className={"vertical-card"}>
                            <FilterCard label={"Бортництво"} imgSrc={card3}/>
                        </div>
                        <div className={"vertical-card"}>
                            <FilterCard label={"Карпатське ліжникарство"} imgSrc={card4}/>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Filters;