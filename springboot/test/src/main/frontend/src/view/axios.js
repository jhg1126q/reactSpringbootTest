import React, {useEffect, useState} from 'react';
import axios from 'axios';

const AxiosBoard = () => {
   const [result, setResult] = useState([]);

    useEffect(() => {
        axios.get('/api/findAllBoardList')
        .then(response => {
            setResult(response.data);
        })
        .catch(error => console.log(error))
    }, []);

    return (
        <div>
            {result.map((v) => (<h1 key={v.id} >{v.id} : {v.title} </h1>) )}
        </div>
    );
}

export default AxiosBoard;