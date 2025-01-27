const express = require('express');

const app = express();
const bodyParser = require('body-parser');
app.use(bodyParser.json());

const port = 3000;

let people = {
    "people": [
        {
            "name": "Anna Müller",
            "age": 28,
            "gender": "female",
            "occupation": "Softwareentwicklerin"
        },
        {
            "name": "Lukas Schmidt",
            "age": 34,
            "gender": "male",
            "occupation": "Projektmanager"
        },
        {
            "name": "Maria Wagner",
            "age": 22,
            "gender": "female",
            "occupation": "Studentin"
        },
        {
            "name": "Jonas Bauer",
            "age": 41,
            "gender": "male",
            "occupation": "Lehrer"
        },
        {
            "name": "Sofia Lehmann",
            "age": 29,
            "gender": "female",
            "occupation": "Designer"
        }
    ]
}


app.get('/GetPeople', (req, res) => { //funktioniert
    res.send(people);
});

app.post('/PostPeople', (req, res) => { //funktioniert
    let person = req.body;
    people.people.push(person);
    res.send('Person is added');
});

app.put('/PutPeople', (req, res) => { //funktioniert
    let personToUpdate = req.body.name;
    let newOccupation = req.body.occupation;

    let person = people.people.find(person => person.name === personToUpdate);

    if (person) {
        person.occupation = newOccupation;
        res.send(`Occupation of ${personToUpdate} has been updated to ${newOccupation}`);
    } else {
        res.status(404).send('Person not found');
    }
});


app.delete('/DeletePeople', (req, res) => { //funktioniert
    let personToDelete = req.body.name;
    let initialLength = people.people.length;
    people.people = people.people.filter(person => person.name !== personToDelete);

    if (people.people.length < initialLength) {
        res.send(`Person with name ${personToDelete} is deleted`);
    } else {
        res.status(404).send('Person not found');
    }
});



app.listen(port, () => console.log(`listening on port ${port}!`))