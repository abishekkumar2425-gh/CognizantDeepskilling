import ListofPlayers from "./ListofPlayers";
import IndianPlayersComponent from "./IndianPlayers";

function App() {
  const flag = true;

  if (flag === true) {
    return <ListofPlayers />;
  } else {
    return <IndianPlayersComponent />;
  }
}

export default App;
