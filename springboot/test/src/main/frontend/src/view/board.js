import { useNavigate } from 'react-router-dom';
import React from 'react';

function Board() {
  let navigate = useNavigate();
  return (
    <div>
      <h1>Board</h1>
      <button
        onClick={() => {
          navigate('/');
        }}
      >누르면 홈으로 이동한다</button>
    </div>
  )
}
export default Board;