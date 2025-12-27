package DesignPattern.TemplateMethodDesign;

public class KNNTrainer extends ModelTrainer{
    @Override
    public void evaluateModel() {
        System.out.println("[KNN] Evaluating accuracy and loss on validation set");
    }

    @Override
    public void trainModel() {
        System.out.println("[KNN] Training KNN model on k = 5");
    }
}
