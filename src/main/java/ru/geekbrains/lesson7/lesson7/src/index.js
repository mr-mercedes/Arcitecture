import React from 'react';
import ReactDOM from 'react-dom/client';
import {Route, Router, Routes} from "react-router-dom";
import './index.css';
import {About} from './About'
import {Main} from "./Main";
import {NotFound} from "./NotFound";


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <React.StrictMode>
        <Router location={'/'}>
            <Routes>
                <Route path="/" element={<Main/>}/>
                <Route path="/about" element={<About/>}/>
                <Route path="*" element={<NotFound/>}/>
            </Routes>
        </Router>
    </React.StrictMode>
);

