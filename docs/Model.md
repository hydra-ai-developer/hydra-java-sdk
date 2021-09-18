

# Model

A model in the workspace

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**description** | **String** | a short description of the model |  [optional]
**templateRef** | [**TemplateRefEnum**](#TemplateRefEnum) | model template reference | 
**labels** | [**List&lt;LabelConfig&gt;**](LabelConfig.md) | provide label configurations only for custom models |  [optional]



## Enum: TemplateRefEnum

Name | Value
---- | -----
MESSAGECLASSIFICATION | &quot;messageClassification&quot;
NAMEDENTITYRECOGNITION | &quot;namedEntityRecognition&quot;
SENTIMENTANALYSIS | &quot;sentimentAnalysis&quot;
COMMONENTITYRECOGNITION | &quot;commonEntityRecognition&quot;
INDUSTRYLABELTAGGER | &quot;industryLabelTagger&quot;
BOXFORMDATA | &quot;boxFormData&quot;



