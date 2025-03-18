-- Consultas
select *
from clientes;
select *
from mascotas;
select *
from historial_estados;
select *
from estados;

-- 1. Muestra cada cliente junto con el número de mascotas que posee, o incluso los nombres de sus mascotas
select *
from clientes as c
         join mascotas as m on c.id_cliente = m.id_cliente;
select c.id_cliente, count(c.id_cliente) as numero_mascotas
from clientes as c
         join mascotas as m on c.id_cliente = m.id_cliente
group by c.id_cliente;
select c.id_cliente,
       c.nombre                    as cliente,
       count(c.id_cliente)         as numero_mascotas,
       STRING_AGG(m.nombre, ' | ') as nombres_mascotas
from clientes as c
         join mascotas as m on c.id_cliente = m.id_cliente
group by c.id_cliente, c.nombre
order by c.id_cliente asc;

--2 
select m.nombre,
       m.cantidad_stock
from medicamentos m
order by m.cantidad_stock asc;

--3
select distinct m.especie,
                count(m.especie) as numero_mascotas_por_especie
from mascotas m
group by m.especie
order by numero_mascotas_por_especie desc;

--4
select m.nombre,
       e.nombre                                        as estado,
       TO_CHAR(he.fecha_hora, 'YYYY-MM-DD HH24:MI:SS') AS fecha_ingreso
from mascotas m
         join historial_estados he on m.id_mascota = he.id_mascota
         join estados e on he.id_estado = e.id_estado
where he.id_estado = 4
order by fecha_ingreso asc;