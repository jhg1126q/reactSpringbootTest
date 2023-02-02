import React from 'react';
import { Link } from 'react-router-dom';

class IndexNavi extends React.Component {
  render() {
    return (
      <nav>
        <Link to='/'>Home</Link>
        <br />
        <Link to='/about'>About</Link>
        <br />
        <Link to='/board'>Board</Link>
        <br />
        <Link to='/axios'>Axios</Link>
      </nav>
    )
  }
}

export default IndexNavi;