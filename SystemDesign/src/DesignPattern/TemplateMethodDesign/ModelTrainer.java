package DesignPattern.TemplateMethodDesign;

abstract class ModelTrainer {
    public final void trainModelPipeline(String path) {
        loadData(path);
        preprocessData();
        trainModel();
        evaluateModel();
        saveModel();
    }

    private void loadData(String path) {
        System.out.println("Loading data from :" + path);
    }

    private void preprocessData() {
        System.out.println("Preprocessing data");
    }

    public abstract void trainModel();
    public abstract void evaluateModel();

    private void saveModel() {
        System.out.println("Saving newly trained model");
    }
}

