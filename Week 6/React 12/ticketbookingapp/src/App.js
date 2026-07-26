import { useState } from "react";
import "./App.css";

import Greeting from "./Components/Greeting";
import LoginButton from "./Components/LoginButton";
import LogoutButton from "./Components/LogoutButton";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  let button;

  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div className="app-container">
      <Greeting isLoggedIn={isLoggedIn} />
      {button}
    </div>
  );
}

export default App;