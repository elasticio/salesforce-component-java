# DemandWare XML file
## Description
This can be used to upload xml file to sftp server.
Input structure corresponds to provided xml samples. 
## Credentials
#### hostname
#### port
#### username
#### password
#### destDir
## Actions
### SubmitRequest
Component accepts data in format described at schema:
`./src/main/schemas/submit.json` 

Then transforms it into XML, format described at schema:
`.src/xsd/Schema.xsd`

File name is form according to:
`LT_DemandwareProduct_(yyyy-MMM-dd.HH.mm.ss).xml`

Then uploads to SFTP configured in credentials.

## Request Example

`{
 	"header": {
 		"image-settings": {
 			"external-location": {
 				"http-url": "string 4717",
 				"https-url": "string 3365"
 			},
 			"view-types": {
 				"view-type": ["string 6309"]
 			},
 			"alt-pattern": "string 6316",
 			"title-pattern": "string 1904"
 		}
 	},
 	"product": [{
 			"ean": 0.9662342412383875,
 			"upc": 0.7057125367935921,
 			"min-order-quantity": 2,
 			"step-quantity": 6,
 			"display-name": [{
 					"value": "string 1510",
 					"lang": "string 6665"
 				}, {
 					"value": "string 4593",
 					"lang": "string 3845"
 				}
 			],
 			"short-description": {
 				"value": "string 5375",
 				"lang": "string 7628"
 			},
 			"long-description": {
 				"value": "string 9110",
 				"lang": "string 6674"
 			},
 			"online-flag": "string 4231",
 			"searchable-flag": "string 7962",
 			"images": {
 				"image-group": [{
 						"image": [{
 								"path": "string 1168"
 							}
 						],
 						"view-type": "string 6437"
 					}
 				]
 			},
 			"tax-class-id": "string 1394",
 			"search-placement": 4,
 			"sitemap-included-flag": "string 7105",
 			"page-attributes": {
 				"page-title": {
 					"value": "string 2429",
 					"lang": "string 9130"
 				},
 				"page-description": {
 					"value": "string 4294",
 					"lang": "string 3448"
 				},
 				"page-keywords": {
 					"value": "string 9629",
 					"lang": "string 6419"
 				},
 				"page-url": {
 					"value": "string 762",
 					"lang": "string 96"
 				}
 			},
 			"custom-attributes": {
 				"custom-attribute": [{
 						"value": "string 1725",
 						"lang": "string 2400",
 						"attribute-id": "string 3056"
 					}
 				]
 			},
 			"product-id": 0.04497134466421193
 		}
 	],
 	"catalog-id": "string 4008"
 }
`