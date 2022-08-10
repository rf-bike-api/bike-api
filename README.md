# bike-api
API that controls sales in a bike store.

<h2>Initial commit</h2>
<strong>Added maven dependencies: </strong><br/>
Spring Boot DevTools<br/>
Lombok<br/>
Spring Web<br/>
Spring Data JPA<br/>
PostGreSQL Driver<br/>

<h2>Added entity annotations</h2>
<strong>Added entity annotations for the respective classes: </strong><br/>
Accessorie<br/>
AccessorieType<br/>
Address<br/>
Bike<br/>
Cart<br/>
Client<br/>
SuspensionType*<br/>

*Added class.

<h2>Added GetMaping</h2>
<strong>Added GetMapping annotations for the following classes: </strong><br/>
Accessory*<br/>
AccessoryType*<br/>
*The name 'accessorie' has been fixed to 'accessory'

<h2>Finished* GetMaping</h2>
<strong>Added GetMapping annotations for the remaining classes: </strong><br/>
Address<br/>
Bike<br/>
Cart<br/>
Client<br/>
SuspensionType<br/>
*Until possible further changes

<h2>Added Data Tranfer Object(DTO)</h2>
<strong>The following canges have been made:</strong><br/>
Added DTO package as well as all of its new classes ('entity_name'DTO);<br/>
Added exception for entity not found;<br/>
Added use of ModelMapper library (for the DTO strategy).<br/>

<h2>Added Class Relationship(DTO)</h2>
<strong>The following changes have been made to add relation between classes:</strong><br/>
Bike @oneToMany SuspensionType<br/>
Client @oneToOne Address<br/>
Accessory @oneToMany AccessoryType<br/>

