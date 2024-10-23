# CU001 - Emparejamiento tipo Tinder

Cuando un usuario desliza a la derecha en un perfil, el sistema realiza un emparejamiento si hay reciprocidad. Si desliza a la izquierda, se muestra un perfil distinto mientras no se haya excedido el máximo de consultas de acuerdo con su plan de usuario.

## Guion -- Curso normal de eventos

1. Usuario desliza a la derecha.
2. El sistema verifica si el otro usuario también deslizó a la derecha.
3. El sistema guarda la información del emparejamiento.
4. El sistema verifica si el usuario ha excedido el límite de consultas según su plan.
5. El sistema muestra el siguiente perfil.

## Flujo alterno

1. Usuario desliza a la izquierda.
2. El sistema verifica si el usuario ha excedido el límite de consultas según su plan.
3. El sistema muestra el siguiente perfil.

## Excepciones -- Respecto al flujo principal

1.1. **Fallo en la verificación de reciprocidad**: Si el sistema no puede verificar si el otro usuario deslizó a la derecha, el emparejamiento no se realiza y se notifica al usuario del fallo.
   
5.1. **Límite de consultas excedido**: Si el usuario ha excedido el límite de consultas de acuerdo con su plan, el sistema le sugiere una actualización de plan en lugar de mostrar un nuevo perfil.

5.2. **Error en la carga de perfiles**: Si el sistema falla al cargar un nuevo perfil, se muestra un mensaje de error y el usuario tiene la opción de intentar nuevamente.
