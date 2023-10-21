public interface Observer {
    //dans le cas de pop, souvent on envoie plein d'infos donc il recoit un type de type evenement
    //void update(Observable o); onClick contient la reference de l'objet qu'il a notifié dans le cas de pop
      void update(int state);// le cas de push
}