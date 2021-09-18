/*
 * hydra.ai API
 * hydra.ai makes it easy to use A.I. inside workflows and your apps. You can use hydra.ai for text classification, named entity recognition and senitment analysis. You can create your own A.I. models or use some of our pre-built models.  This API supports creating, training and invoking A.I. models hosted in your hydra.ai workspace. Create an account at https://build.hydra.ai to get started. You get get your API key in the settings section.    
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: hello@hydra.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.hydra.services;

import ai.hydra.client.ApiException;
import ai.hydra.model.Model;
import ai.hydra.model.ModelApiResponse;
import ai.hydra.model.PredictionRequest;
import ai.hydra.model.TrainingData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModelApi
 */
@Ignore
public class ModelApiTest {

    private final ModelApi api = new ModelApi();

    
    /**
     * Activate model
     *
     * Activate model
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activateModelTest() throws ApiException {
        String workspaceId = null;
        String modelId = null;
        ModelApiResponse response = api.activateModel(workspaceId, modelId);

        // TODO: test validations
    }
    
    /**
     * Add a training data object for a model
     *
     * Create a new model in the workspace identified in the workspaceId path paramter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTrainingDataTest() throws ApiException {
        String workspaceId = null;
        String modelId = null;
        TrainingData trainingData = null;
        ModelApiResponse response = api.addTrainingData(workspaceId, modelId, trainingData);

        // TODO: test validations
    }
    
    /**
     * Create a new model in the workspace
     *
     * Create a new model in the workspace identified in the workspaceId path paramter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createModelTest() throws ApiException {
        String workspaceId = null;
        Model model = null;
        ModelApiResponse response = api.createModel(workspaceId, model);

        // TODO: test validations
    }
    
    /**
     * Deactivate model
     *
     * Deactivate model
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deactivateModelTest() throws ApiException {
        String workspaceId = null;
        String modelId = null;
        ModelApiResponse response = api.deactivateModel(workspaceId, modelId);

        // TODO: test validations
    }
    
    /**
     * Delete model
     *
     * Delete model
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelTest() throws ApiException {
        String workspaceId = null;
        String modelId = null;
        ModelApiResponse response = api.deleteModel(workspaceId, modelId);

        // TODO: test validations
    }
    
    /**
     * Make a prediction using a model
     *
     * Create anew model in the workspace identified in the workspaceId path paramter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void predictTest() throws ApiException {
        String workspaceId = null;
        String modelId = null;
        PredictionRequest predictionRequest = null;
        ModelApiResponse response = api.predict(workspaceId, modelId, predictionRequest);

        // TODO: test validations
    }
    
    /**
     * Shows model stats
     *
     * Shows the model score and last training time
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showModelStatsTest() throws ApiException {
        String workspaceId = null;
        String modelId = null;
        ModelApiResponse response = api.showModelStats(workspaceId, modelId);

        // TODO: test validations
    }
    
    /**
     * Submit model for training
     *
     * Submit the model for training using the provided training data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void trainModelTest() throws ApiException {
        String workspaceId = null;
        String modelId = null;
        ModelApiResponse response = api.trainModel(workspaceId, modelId);

        // TODO: test validations
    }
    
}
