import React from 'react';
import Home from '../view/home';
import About from '../view/about';
import Board from '../view/board';
import AxiosBoard from '../view/axios';
import { Routes, Route } from 'react-router-dom';

class RouterComponent extends React.Component {
  render() {
    return (
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
        <Route path="/board" element={<Board />} />
        <Route path="/axios" element={<AxiosBoard />} />
      </Routes>
    )
  }
}

export default RouterComponent;