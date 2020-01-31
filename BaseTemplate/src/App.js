import React from 'react';
import './App.css';
import ResponsiveDrawer from './components/ResponsiveDrawer';
import {BrowserRouter as Router,Route} from "react-router-dom";
import Daily from "./components/Daily"
let dashboardRoutes = [
    {
      path: "/dashboard",
      name: "Dashboard",
      component: Daily
    }];
function App() {
  return (
    <div className="App">
      <Router>
         <Route
                  path="/dashboard"
                  component={Daily}
                />
     <ResponsiveDrawer/>
     </Router>
    </div>
  );
}

export default App;
