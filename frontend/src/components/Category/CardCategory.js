import React, { useContext } from "react";
// import { useState } from "react";
import { CategoryContext } from "../../context/CategoryContext";
import { CardStyled } from "./CardCategoryStyled";

const CardCategory = ({ img, category, info, categoryName }) => {
  const { setCategorieSelected } = useContext(CategoryContext);
  // const [collapse, setCollapse]= useState(false)
 
  
 
  return (
    <>
   
      <CardStyled>
        <div className="accordion-item" >

          <div
            onClick={() => {
              setCategorieSelected(categoryName);              
        
            }}
            id="collapseOne"
            className="accordion-collapse collapse show"
            data-bs-toggle="collapse"
            aria-expanded="true"
            aria-controls="collapseOne"
            // data-bs-target="#collapseOne"
          
          
         
            
          >
        
            <img src={img} alt={category} />

            {/* <div>
            <div
              onClick={() => {
                setCategorieSelected(categoryName);
                setCollapse(true)
              }}
              className="label"
            
              
        
            >
              <h2>{category}</h2>
              <p>{info}</p>
            </div>
          </div> */}

          </div> 


          
        
          <div>
            <div
              onClick={() => {
                setCategorieSelected(categoryName);

              }}
              className="label"
        
            >
              <h2>{category}</h2>
              <p>{info}</p>
            </div>
            </div>



     


        </div>
      </CardStyled>
    </>
  );
};

export default CardCategory;
