public interface Strategy {
    void efectuerOperation();
}
//on peut definir aussi une classe abstraite
// public class Strategy au lieu de implement on utilise extend
// car le polymorphisme nous permet de faire la meme chose mais lorsqu'on veut heriter
//de plusieurs classes, on peut pas
//on peut pas faire extends xxx,yyy
//or lorsque on utilise interface onpeut la faire extends xxx implements yyy
//super.operationStrategy()
