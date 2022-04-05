import React, { useState, useEffect } from 'react'
import axios from 'axios'

function Character() {
  const [loading, setLoading] = useState(true)
  const [person, setPerson] = useState({})

  useEffect(() => {
    const fetchData = async () => {
      setLoading(true)
      try {
        const { data: response } = await axios.get('https://swapi.dev/api/people/1')
        setPerson(response)
      } catch (error) {
        console.log(error.message)
      }
      setLoading(false)
    }

    fetchData()
  }, [])

  return (
    loading ? (
      <div>Loading</div>
    ) : (
      <div>
        Person: {person.name}
      </div>
    )
  )
}

export default Character
