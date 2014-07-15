import Human from '../models/human';
import Humans from '../models/humans';

Polymer("humans-list",{
  ready: function () {

    this.humansCollection = new Humans();
    this.humansCollection.on({"fetch":this.update()});

    this.humansCollection.fetch();

},

  update: function() { // called when collection is "fetched"
    this.humans = this.humansCollection.models;
  }
});

