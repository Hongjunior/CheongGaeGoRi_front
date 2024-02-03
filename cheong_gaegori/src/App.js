import React from 'react';
import './App.css';
import Header from './component/Header';

function App() {
  const handleButtonClick = () => {
    alert('Button Clicked!');
  };

  return (
    <div className='App'>
      <Header />
    </div>
  );
}

export default App;
