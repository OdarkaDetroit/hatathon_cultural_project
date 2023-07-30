import React from 'react'
import {Homepage, Articles} from "./pages";
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';

const App = () => {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<Homepage/>}/>
                <Route path="/articles" element={<Articles/>}/>
                <Route path="/articles/1" element={<Homepage/>}/>
                <Route path="/tests" element={<Homepage/>}/>
            </Routes>
        </Router>
    )
}
export default App;
