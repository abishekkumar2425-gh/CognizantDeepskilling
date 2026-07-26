import React, { useState } from "react";
import "./App.css";
import CurrencyConverter from "./Components/CurrencyConverter";

function App() {
  const [counter, setCounter] = useState(5);

  const increment = () => {
    setCounter(counter + 1);
  };

  const decrement = () => {
    setCounter(counter - 1);
  };

  const sayHello = () => {
    alert("Hello Member");
  };

  const incrementAndSayHello = () => {
    increment();
    sayHello();
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div>
      <p>{counter}</p>

      <button onClick={incrementAndSayHello}>Increment</button>
      <br />

      <button onClick={decrement}>Decrement</button>
      <br />

      <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
      <br />

      <button onClick={handleClick}>Click on me</button>

      <CurrencyConverter />
    </div>
  );
}

export default App;