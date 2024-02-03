import React from 'react';
import './App.css';

function App() {
  const handleButtonClick = () => {
    alert('Button Clicked!');
  };

  return (
    <div className='App'>
      <Header />
      <h1>hello, World!</h1>
      <h2>hello, World!</h2>
      <h6>hello, World!</h6>
      <a>hello, World!</a>
      <p>hello, World!</p>
      <button onClick={handleButtonClick}>글쓰기</button>
    </div>
  );
}

export default App;
