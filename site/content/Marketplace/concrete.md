---
title: Concrete
description: 
---

Available products 

# Unused reinforced concrete  
![reinforcedconcrete](https://user-images.githubusercontent.com/101006225/156900625-7c5429b6-3449-4660-964c-78049854a348.png) 
## Upbuild Ptd Ltd 
Surplus reinforced concrete from construction of bridges 

Tags: #unused #reinforced 


# Demolished normal strength concrete 
![demolished concrete](https://user-images.githubusercontent.com/101006225/156900931-6bf0522e-ba98-47cc-b31b-a0f76fad4333.jpg) 
## James and Bob Ptd Ltd 
Obtained from demolishing a 5 year old building 

Tags: #demolished #normal strength 

<div class="bg-off-white pv4">
  <div class="ph3 mw7 center">
    <h2 class="f2 b lh-title mb2">{{.intro.heading}}</h2>
    <p class="mb4 mw6">{{.intro.text}}</p>

    <div class="flex-ns mhn2-ns mb3">
      {{ range .products }}
      <div class="ph2-ns w-50-ns">
        <img src="{{.image}}" alt="" class="center db mb3" style="width: 240px">
        <p>{{.text}}</p>
      </div>
      {{ end }}
    </div>

    <div class="tc">
      <a href="/" class="btn raise">Find out more</a>
    </div>
  </div>
</div>
