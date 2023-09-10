package main.java.ru.geekbrains.lesson5;

import java.util.Collection;
/**
 * Интерфейс BLL (Business Logical Layer)
 */
public interface BusinessLogicalLayer {
    Collection<Model3D> getAllModels();

    Collection<Texture> getAllTextures();

    void renderModel(Model3D model);

    void renderAllModels();
    void saveNewModel(Model3D model);
    void deleteModel(Model3D model);
}
