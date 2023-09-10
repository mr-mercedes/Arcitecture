package main.java.ru.geekbrains.lesson5;

import java.util.Collection;
import java.util.Random;

/**
 * Реализация Business Logical Layer
 */
public class EditorBusinessLogicalLayer implements BusinessLogicalLayer{
    private final DatabaseAccess databaseAccess;


    public EditorBusinessLogicalLayer(DatabaseAccess databaseAccess) {
        this.databaseAccess = databaseAccess;
    }

    @Override
    public Collection<Model3D> getAllModels() {
        return databaseAccess.getAllModels();
    }

    @Override
    public Collection<Texture> getAllTextures() {
        return databaseAccess.getAllTextures();
    }

    @Override
    public void renderModel(Model3D model) {
        processRender(model);
    }

    @Override
    public void renderAllModels() {
        for (Model3D model : getAllModels())
            processRender(model);
    }

    @Override
    public void saveNewModel(Model3D model) {
        databaseAccess.addEntity(model);
    }

    @Override
    public void deleteModel(Model3D model) {
        databaseAccess.removeEntity(model);
    }

    private final Random random = new Random();

    private void processRender(Model3D model){
        try
        {
            Thread.sleep(2500 - random.nextInt(2000));
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
