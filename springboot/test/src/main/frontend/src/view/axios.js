import React, {useEffect, useState} from 'react';
import axios from 'axios';

function App() {
   const [result, setResult] = useState('')

    useEffect(() => {
        axios.get('/api/findAllBoardList')
        .then(response => setResult(response.data.length))
        .catch(error => console.log(error))
    }, []);

    return (
        <div>
            백엔드에서 가져온 데이터입니다 : {result} 개의 데이터
        </div>
    );
}
export default App;