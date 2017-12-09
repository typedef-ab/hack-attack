import * as React from "react";
import {render} from "react-dom";

import axios from "axios";
import {Config} from "./config";

class App extends React.Component<{}, {}> {

  public App() {
    this.login = this.login.bind(this);
  }

  private login(): void {
    axios.get(`${Config.HOST}/hello`)
      .then((response) => {
        console.log(response);
      });
  }

  public render(): JSX.Element {
    return (
      <div>
        Hello World!
        <button onClick={this.login}>Click me!</button>
      </div>
    );
  }
}

render(<App/>, document.getElementById("app"));
