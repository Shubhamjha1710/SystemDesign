package DesignPattern.TemplateMethodDesign;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Neural Network Training ===");
        ModelTrainer nnTrainer = new NeuralNetworkTrainer();
        nnTrainer.trainModelPipeline("data/images/");

        System.out.println("\n=== K nearest neighbour Training ===");
        ModelTrainer dtTrainer = new KNNTrainer();
        dtTrainer.trainModelPipeline("data/iris.csv");
    }
}
