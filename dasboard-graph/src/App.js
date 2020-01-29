import React from 'react';
import './App.css';

import Daily from './components/dashboard/Daily';
import Monthly from './components/dashboard/Monthly';
function App() {
  
  return (
    <div className="App">
      <div  style={{float:'left',padding:'2rem'}}>
  <Daily/>
  </div>
  <div style={{float:'right',padding:'2rem'}}>
  <Monthly />
    </div>
    </div>
  );
}

export default App;
