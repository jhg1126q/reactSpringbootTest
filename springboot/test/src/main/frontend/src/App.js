import { BrowserRouter } from 'react-router-dom';
import IndexNavi from './components/indexNavi';
import RouterComponent from './components/routers';

function App() {
  return (
    <BrowserRouter>
      <IndexNavi></IndexNavi>
      <RouterComponent></RouterComponent>
    </BrowserRouter>
  );
}

export default App;
