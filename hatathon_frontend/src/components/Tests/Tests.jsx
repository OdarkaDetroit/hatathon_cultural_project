import React from 'react'
import "./Tests.css"
import TestButtonCard from "../TestButtonCard/TestButtonCard";
import clock from './clock.svg'
import question from './question.svg'

const Tests = () => {
    return (
        <div className="tests-section wrapper">
            <h1 className="blue-header">Вивчай спадщину через тести</h1>
            <div className="tests">
                <div className="test-row">
                    <TestButtonCard label={"Обряди та звичаї"} width={510} link={"#"}/>
                    <TestButtonCard label={"Культура харчування"} width={690} link={"#"}/>
                </div>
                <div className="test-row">
                    <TestButtonCard label={"Побут"} width={408} link={"#"}/>
                    <TestButtonCard label={"Традиційні ремесла"} width={768} link={"#"}/>
                </div>
                <div className="test-row">
                    <TestButtonCard label={"Усні традиції"} width={588} link={"#"}/>
                    <TestButtonCard label={"Виконаське мистецтво"} width={588} link={"#"}/>
                </div>
            </div>
            <div className="test-info">
                <div className={"info-tab"}>
                    <img src={clock} alt="Clock"/>
                    <div className={"info-tab-text"}>
                        <div className={"text-header"}>10 хвилин</div>
                        <div className={"text-general"}>тесту</div>
                    </div>
                </div>

                <div className={"info-tab"}>
                    <img src={question} alt="Question"/>
                    <div className={"info-tab-text"}>
                        <div className={"text-header"}>4 запитання</div>
                        <div className={"text-general"}>загалом</div>
                    </div>
                </div>
            </div>


            <a href="#" className={"start-test-btn"}>Розпочати тест</a>
        </div>
    )
}

export default Tests;