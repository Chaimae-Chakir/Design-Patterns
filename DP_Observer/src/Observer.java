public interface Observer {
    //public void update(Observable o); onClick contient la reference de l'objet qu'il a notifié dans le cas de pop
    public void update(int state);//dans le cas de pop, souvent on envoie plein d'infos donc il recoit un type de type evenement

}
