//!ES6
import Human from './human';

class Humans extends Backbone.Collection {

  constructor (args) {
    console.log("I'm collection!")
    this.model = Human;
    this.url = "/humans";
    super(args);
  }
}

export default Humans;
