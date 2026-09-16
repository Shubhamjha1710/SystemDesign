package DesignPattern.TemplateMethodDesign;

public class NeuralNetworkTrainer extends ModelTrainer {
    @Override
    public void evaluateModel() {
        System.out.println("[NeuralNetwork] Evaluating accuracy and loss on validation set");
    }

    @Override
    public void trainModel() {
        System.out.println("[NeuralNetwork] Training Neural Network for 100 epochs");
    }
}
