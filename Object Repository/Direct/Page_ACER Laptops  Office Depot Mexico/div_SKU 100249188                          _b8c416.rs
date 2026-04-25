<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_SKU 100249188                          _b8c416</name>
   <tag></tag>
   <elementGuidId>807bcf59-9b69-44ce-aa03-b9e86b829e0f</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='grid'])[1]/following::div[2]</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.product-cnt.clearfix</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>.product-cnt >> nth=0</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>af8fd7c6-8456-4227-aa33-f1fecefe0744</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>product-cnt clearfix</value>
      <webElementGuid>39f312ce-cde7-4aae-8b5f-bbb928e16c19</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
            
                               
                                 
                
                
            
        
        
		        
		            
						
		    

            
        	
	                    
	                                
	                            
	                        
	                    
	                
	            
                
                    
                
                    SKU: 100249188
                
            
            
                
                                    
                                            
                                                Laptop Acer Aspire Lite 15 Intel Core i5 16GB RAM 512GB SSD 15.6 pulgadas
                                        
                                    
                                
                                    
                                        Agotado
                                    
                                    
    
                $12,999.00
    
            
                $15,499.00
    
        
                                        
                                
                                    
                                    
                                        
                                            
                                    
                            
        
            
                    .ProductGridComponent-ListPickUpInStoreAction{
                        display: block;
                    }
                
            
                    
                         
                            
                                        
                                                
			
    function addToCartDatalayer(sku,name,catego,marc,precio) {

        console.log('Product Grid: Data Layer event addToCart...');

        dataLayer.push({
            'event': 'addToCart',
            'ecommerce': {
                'add': {
                    'products': [{
                        'name':name,
                        'id':sku,
                        'category': catego,
                        'brand': marc,
                        'price':precio,
                        'quantity':1
                    }]
                }
            }
        });
    }


            
            
            
            

            


	
			
	function addToCartDatalayer(...args) {

		const [sku, name, catego, marc, precio] = [...args];

		dataLayer.push({
			'event': 'addToCart',
			'ecommerce': {
				'add': {
					'products': [{
						'name': name,
						'id': sku,
						'category': catego,
						'brand': marc,
						'price': precio,
						'quantity': 1
					}]
				}
			}
		});
    }




	
                                
                        
                    
                
			
		            
		            
		    </value>
      <webElementGuid>44444f89-6473-474e-9431-978a8472ea14</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@class=&quot;page-productGrid pageType-CategoryPage template-pages-category-productGridPage  smartedit-page-uid-productGrid smartedit-page-uuid-eyJpdGVtSWQiOiJwcm9kdWN0R3JpZCIsImNhdGFsb2dJZCI6Im9mZmljZWRlcG90Q29udGVudENhdGFsb2ciLCJjYXRhbG9nVmVyc2lvbiI6Ik9ubGluZSJ9 smartedit-catalog-version-uuid-officedepotContentCatalog/Online  language-en&quot;]/main[1]/div[@class=&quot;cnt-page account-section-content cancelacan&quot;]/div[@class=&quot;container-grid2021 container-gridMX&quot;]/div[@class=&quot;container back-grid&quot;]/div[@class=&quot;row&quot;]/div[@class=&quot;col-sm-12 content-grid-products&quot;]/div[@class=&quot;yCmsContentSlot product-grid-right-result-slot&quot;]/div[@class=&quot;yCmsComponent product__list--wrapper yComponentWrapper product-grid-right-result-component&quot;]/div[@class=&quot;product__switch_view product__listing product__grid&quot;]/div[@class=&quot;product-item&quot;]/div[@class=&quot;product-cnt clearfix&quot;]</value>
      <webElementGuid>d824df5a-9e25-4387-9ac1-de9c1492ce02</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='grid'])[1]/following::div[2]</value>
      <webElementGuid>1b8a5bda-842f-46d3-9b0d-b8e1fd8ba3dd</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[5]/div/div[2]/div</value>
      <webElementGuid>27ec23eb-ad74-4aa6-b83c-58fae276bfca</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot;
        
            
                               
                                 
                
                
            
        
        
		        
		            
						
		    

            
        	
	                    
	                                
	                            
	                        
	                    
	                
	            
                
                    
                
                    SKU: 100249188
                
            
            
                
                                    
                                            
                                                Laptop Acer Aspire Lite 15 Intel Core i5 16GB RAM 512GB SSD 15.6 pulgadas
                                        
                                    
                                
                                    
                                        Agotado
                                    
                                    
    
                $12,999.00
    
            
                $15,499.00
    
        
                                        
                                
                                    
                                    
                                        
                                            
                                    
                            
        
            
                    .ProductGridComponent-ListPickUpInStoreAction{
                        display: block;
                    }
                
            
                    
                         
                            
                                        
                                                
			
    function addToCartDatalayer(sku,name,catego,marc,precio) {

        console.log(&quot; , &quot;'&quot; , &quot;Product Grid: Data Layer event addToCart...&quot; , &quot;'&quot; , &quot;);

        dataLayer.push({
            &quot; , &quot;'&quot; , &quot;event&quot; , &quot;'&quot; , &quot;: &quot; , &quot;'&quot; , &quot;addToCart&quot; , &quot;'&quot; , &quot;,
            &quot; , &quot;'&quot; , &quot;ecommerce&quot; , &quot;'&quot; , &quot;: {
                &quot; , &quot;'&quot; , &quot;add&quot; , &quot;'&quot; , &quot;: {
                    &quot; , &quot;'&quot; , &quot;products&quot; , &quot;'&quot; , &quot;: [{
                        &quot; , &quot;'&quot; , &quot;name&quot; , &quot;'&quot; , &quot;:name,
                        &quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;:sku,
                        &quot; , &quot;'&quot; , &quot;category&quot; , &quot;'&quot; , &quot;: catego,
                        &quot; , &quot;'&quot; , &quot;brand&quot; , &quot;'&quot; , &quot;: marc,
                        &quot; , &quot;'&quot; , &quot;price&quot; , &quot;'&quot; , &quot;:precio,
                        &quot; , &quot;'&quot; , &quot;quantity&quot; , &quot;'&quot; , &quot;:1
                    }]
                }
            }
        });
    }


            
            
            
            

            


	
			
	function addToCartDatalayer(...args) {

		const [sku, name, catego, marc, precio] = [...args];

		dataLayer.push({
			&quot; , &quot;'&quot; , &quot;event&quot; , &quot;'&quot; , &quot;: &quot; , &quot;'&quot; , &quot;addToCart&quot; , &quot;'&quot; , &quot;,
			&quot; , &quot;'&quot; , &quot;ecommerce&quot; , &quot;'&quot; , &quot;: {
				&quot; , &quot;'&quot; , &quot;add&quot; , &quot;'&quot; , &quot;: {
					&quot; , &quot;'&quot; , &quot;products&quot; , &quot;'&quot; , &quot;: [{
						&quot; , &quot;'&quot; , &quot;name&quot; , &quot;'&quot; , &quot;: name,
						&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;: sku,
						&quot; , &quot;'&quot; , &quot;category&quot; , &quot;'&quot; , &quot;: catego,
						&quot; , &quot;'&quot; , &quot;brand&quot; , &quot;'&quot; , &quot;: marc,
						&quot; , &quot;'&quot; , &quot;price&quot; , &quot;'&quot; , &quot;: precio,
						&quot; , &quot;'&quot; , &quot;quantity&quot; , &quot;'&quot; , &quot;: 1
					}]
				}
			}
		});
    }




	
                                
                        
                    
                
			
		            
		            
		    &quot;) or . = concat(&quot;
        
            
                               
                                 
                
                
            
        
        
		        
		            
						
		    

            
        	
	                    
	                                
	                            
	                        
	                    
	                
	            
                
                    
                
                    SKU: 100249188
                
            
            
                
                                    
                                            
                                                Laptop Acer Aspire Lite 15 Intel Core i5 16GB RAM 512GB SSD 15.6 pulgadas
                                        
                                    
                                
                                    
                                        Agotado
                                    
                                    
    
                $12,999.00
    
            
                $15,499.00
    
        
                                        
                                
                                    
                                    
                                        
                                            
                                    
                            
        
            
                    .ProductGridComponent-ListPickUpInStoreAction{
                        display: block;
                    }
                
            
                    
                         
                            
                                        
                                                
			
    function addToCartDatalayer(sku,name,catego,marc,precio) {

        console.log(&quot; , &quot;'&quot; , &quot;Product Grid: Data Layer event addToCart...&quot; , &quot;'&quot; , &quot;);

        dataLayer.push({
            &quot; , &quot;'&quot; , &quot;event&quot; , &quot;'&quot; , &quot;: &quot; , &quot;'&quot; , &quot;addToCart&quot; , &quot;'&quot; , &quot;,
            &quot; , &quot;'&quot; , &quot;ecommerce&quot; , &quot;'&quot; , &quot;: {
                &quot; , &quot;'&quot; , &quot;add&quot; , &quot;'&quot; , &quot;: {
                    &quot; , &quot;'&quot; , &quot;products&quot; , &quot;'&quot; , &quot;: [{
                        &quot; , &quot;'&quot; , &quot;name&quot; , &quot;'&quot; , &quot;:name,
                        &quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;:sku,
                        &quot; , &quot;'&quot; , &quot;category&quot; , &quot;'&quot; , &quot;: catego,
                        &quot; , &quot;'&quot; , &quot;brand&quot; , &quot;'&quot; , &quot;: marc,
                        &quot; , &quot;'&quot; , &quot;price&quot; , &quot;'&quot; , &quot;:precio,
                        &quot; , &quot;'&quot; , &quot;quantity&quot; , &quot;'&quot; , &quot;:1
                    }]
                }
            }
        });
    }


            
            
            
            

            


	
			
	function addToCartDatalayer(...args) {

		const [sku, name, catego, marc, precio] = [...args];

		dataLayer.push({
			&quot; , &quot;'&quot; , &quot;event&quot; , &quot;'&quot; , &quot;: &quot; , &quot;'&quot; , &quot;addToCart&quot; , &quot;'&quot; , &quot;,
			&quot; , &quot;'&quot; , &quot;ecommerce&quot; , &quot;'&quot; , &quot;: {
				&quot; , &quot;'&quot; , &quot;add&quot; , &quot;'&quot; , &quot;: {
					&quot; , &quot;'&quot; , &quot;products&quot; , &quot;'&quot; , &quot;: [{
						&quot; , &quot;'&quot; , &quot;name&quot; , &quot;'&quot; , &quot;: name,
						&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;: sku,
						&quot; , &quot;'&quot; , &quot;category&quot; , &quot;'&quot; , &quot;: catego,
						&quot; , &quot;'&quot; , &quot;brand&quot; , &quot;'&quot; , &quot;: marc,
						&quot; , &quot;'&quot; , &quot;price&quot; , &quot;'&quot; , &quot;: precio,
						&quot; , &quot;'&quot; , &quot;quantity&quot; , &quot;'&quot; , &quot;: 1
					}]
				}
			}
		});
    }




	
                                
                        
                    
                
			
		            
		            
		    &quot;))]</value>
      <webElementGuid>c322e726-0d9f-458e-a1ef-d038ead2c20b</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
